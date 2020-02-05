package visitorpattern;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}
