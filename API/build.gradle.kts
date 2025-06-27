plugins {
    id("re.alwyn974.groupez.publish") version "1.0.0"
}

rootProject.extra.properties["sha"]?.let { sha ->
    version = sha
}

tasks {
    shadowJar {
        relocate("fr.traqueur.currencies", "fr.maxlego08.zshop.currencies")

        destinationDirectory.set(rootProject.extra["apiFolder"] as File)
    }

    build {
        dependsOn(shadowJar)
    }
}

publishConfig {
    githubOwner.set("GroupeZ-dev")
}
