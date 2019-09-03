package examples;

import java.util.List;
import java.util.function.Consumer;

public class Spuds {

	static Consumer<Integer> mashedSpudsRecipe = (x) -> System.out.println("Making mashed spuds.");
	static Consumer<Integer> roastSpudsRecipe = (x) -> System.out.println("Making roast spuds.");

	public static void main(String[] args) {

		IrishPerson june = new IrishPerson();
		IrishPerson iain = new IrishPerson();

		june.setCookingMethod(roastSpudsRecipe);
		iain.setCookingMethod(mashedSpudsRecipe);

		List<IrishPerson> irishPeople = List.of(june, iain);

		for (IrishPerson irishPerson : irishPeople) {
			irishPerson.cookSpuds();
		}
	}
}

class IrishPerson {

	private Consumer<Integer> cookingMethod;

	public void setCookingMethod(Consumer<Integer> cookingMethod) {
		this.cookingMethod = cookingMethod;
	}

	void cookSpuds() {
		cookingMethod.accept(0);
	}

}
