package HerenciaMultiple;

public interface Herbivoro extends Animal{

	@Override
	public default void darDeComer() {
		System.out.println("como como un herbivoro");
	}
}
