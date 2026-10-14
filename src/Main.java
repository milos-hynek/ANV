//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    // lesson 1 - singleton:
    System.out.println("Název kavárny: " + CafeConfig.getInstance().getCafeName());

    // lesson 2 - factory:
    Drink tea = DrinkFactory.createDrink("tea");
    Drink coffee = DrinkFactory.createDrink("coffee");
    System.out.println(tea.serve());
    System.out.println(coffee.serve());

}
