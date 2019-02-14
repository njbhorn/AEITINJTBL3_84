
public class Program  {

	Tree[] trees = new Tree[5];

	public static void main(String[] args) {

		new Program() ;

	}

	public Program() {
		fillArray();

		// swap 1st with last
		Tree temp = trees[0] ;
		trees[0] = trees[4];
		trees[4] = temp ;

		System.out.println(removalAnalysis());

		growAllTrees();
		System.out.println(String.format("Total debris first year %.1f", Tree.totalDebrisCollectionWeight(trees)));

		growAllTrees();
		System.out.println(String.format("Total debris second year %.1f", Tree.totalDebrisCollectionWeight(trees)));
//
		growAllTrees();
//		System.out.println(String.format("Total debris third year %.1f", Tree.totalDebrisCollectionWeight(trees)));

		System.out.println();
		displayDetailsOf(TreeType.DECIDUOUS) ;
		System.out.println();
		displayDetailsOf(TreeType.EVERGREEN) ;
	}



	private void displayDetailsOf(TreeType treeType) {
		for ( Tree tree : trees ) {
			if ( tree.getTreeType() == treeType ) {
				System.out.println(tree.getDetails()) ;
			}
		}
	}

	private void fillArray() {

		Tree oak = new Tree ( "Oak", 8, 1.9, TreeType.DECIDUOUS);
		Tree larch = new Tree ( "Larch", 15, 0.4, TreeType.DECIDUOUS);
		Tree sycamore = new Tree ( "Sycamore", 7, 1.4, TreeType.DECIDUOUS);
		Tree pine = new Tree ( "Pine", 5, 1.7, TreeType.EVERGREEN);
		Tree fir = new Tree ( "Fir", 11, 0.4, TreeType.EVERGREEN);
		trees[0] = oak ;
		trees[1] = larch ;
		trees[2] = sycamore ;
		trees[3] = pine ;
		trees[4] = fir ;
	}

	private String removalAnalysis() {
		StringBuilder retVal = new StringBuilder() ;

		for ( Tree tree : trees ) {
			double height = 0 ;
			int noYears = 0 ;

//			while ( tree.getHeight() < Tree.getMaxHeight() ) {
//				tree.setHeight(tree.getHeight() + tree.getAnnualGrowth() );
			while ( height < Tree.getMaxHeight() ) {
				height += (tree.getHeight() + tree.getAnnualGrowth() );
				noYears++ ;
			}
			String treeInfo = String.format("%s tree will need removal in %d years\n"
					, tree.getName()
					, noYears) ;
			retVal.append(treeInfo) ;
		}

		return retVal.toString() ;

//		StringBuilder sb = new StringBuilder();
//		for (Tree t : trees) {
//			int yearCount = (int) ((Tree.getMaxHeight() - t.getHeight()) / t.getAnnualGrowth()) + 1;
//			sb.append(String.format("%s tree will need removal in %d years\n", t.getName(), yearCount));
//		}
//		return sb.toString();
	}

	private void growAllTrees() {
		for ( Tree tree : trees ) {
			tree.grow();
		}
	}


}
