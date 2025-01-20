package HerenciaMultiple;

public interface Carnivoro extends Animal {
	
	@Override
	public default void darDeComer() {
		System.out.println("como como un carnivoro");
	}
	
}
