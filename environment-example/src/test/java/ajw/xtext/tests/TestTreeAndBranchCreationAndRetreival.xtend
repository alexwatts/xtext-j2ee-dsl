package ajw.xtext.tests

import entities.Branch
import entities.Tree
import org.apache.commons.lang3.RandomStringUtils
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class TestTreeAndBranchCreationAndRetreival extends BaseAccessorTest {

	protected Logger logger = LoggerFactory::getLogger(this.class)
	
	def void testCreateTree() {

		val tree = getNewTree(RandomStringUtils::random(10))
		
		em.transaction.begin
		
	    super.accessor.addTree(tree)
		
		em.transaction.commit
		
		assertTrue(accessor.allTrees.size == 1)
	
	}
	
	def void testCreateAndAssociateBranch() {
		
		val treeName = RandomStringUtils::randomAlphabetic(10)
		
		val branchName = RandomStringUtils::randomAlphabetic(10)
		
		val tree = getNewTree(treeName)
		
		val branch = getNewBranch(branchName)

		startTransaction()
			
		super.accessor.addTree(tree)
		
		super.accessor.addTreeToBranch(branch, tree)
		
		endTransaction()
		
		val results = super.accessor.allTreesAndBranches
		
		assertEquals(results.get(0).tree.treeName, treeName)
		
		assertEquals(results.get(0).tree.branches.get(0).branchName, branchName)
	
	}

	def Tree getNewTree(String treeName) {
		
		val tree = new Tree()
		
		tree.treeName = treeName
		
		return tree
		
	}
	
	def Branch getNewBranch(String branchName) {
		
		val branch = new Branch()
		
		branch.branchName = branchName
		
		return branch
		
	}
	
	def startTransaction() {
		em.transaction.begin
	}
	
	def endTransaction() {
		em.transaction.commit
	}
	
}