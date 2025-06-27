package fr.maxlego08.shop.placeholder;
@FunctionalInterface
public interface ReturnBiConsumer<T, G, C> {

	C accept(T t, G g);
	
}