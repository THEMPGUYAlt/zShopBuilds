package fr.maxlego08.shop.placeholder;
@FunctionalInterface
public interface ReturnTriConsumer<A, T, G, C> {

	C accept(A a, T t, G g);
	
}