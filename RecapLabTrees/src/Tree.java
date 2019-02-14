
public class Tree {

	private String name;
	private double height;
	private double annualGrowth;
	private TreeType treeType;
	private static double maxHeight = 20;
	private String details;

	public Tree(String name, double height, double annualGrowth, TreeType treeType) {
		super();
		this.name = name;
		this.height = height;
		this.annualGrowth = annualGrowth;
		this.treeType = treeType;
	}

	public void grow() {
		this.height += this.annualGrowth;
	}

	public static double totalDebrisCollectionWeight(Tree[] trees) {
		double totalDebris = 0;
		for (Tree tree : trees) {
			switch (tree.treeType) {
			case DECIDUOUS:
				totalDebris += tree.height * 0.09;
				break;
			case EVERGREEN:
				totalDebris += tree.height * 0.02;
				break;
			}
		}
		return totalDebris;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getAnnualGrowth() {
		return annualGrowth;
	}

	public void setAnnualGrowth(double annualGrowth) {
		this.annualGrowth = annualGrowth;
	}

	public TreeType getTreeType() {
		return treeType;
	}

	public void setTreeType(TreeType treeType) {
		this.treeType = treeType;
	}

	public static double getMaxHeight() {
		return maxHeight;
	}

	public String getDetails() {
		this.details = String.format("Tree: %s - %s. Height: %.1f Growth: %.1f metres p.a.", this.name,
				this.treeType.toString(), this.height, this.annualGrowth);
		return this.details;
	}
}
