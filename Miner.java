public class Miner {
	public int mainBlockchain = 0; //what this miner believes the main blockchain to be
	public int ownBlockchain = 0;	//amount of blocks known that have not been added
	public int blocksWon = 0;	//amount of blocks that have been added to the main chain. This might get fucky with eclipse attacks
	public int miningPower = 0;

	private long[] connections = new long[6]; //arbitrarily set to have each miner have at most 6 connections. IDs of other Miners will be stored in here.
	private final long ID;
	/* Begin attempting to discover a block on the chain. Each miner
	 *  is constantly guessing a random number (goal). When it hits the correct
	 *  number, it is rewarded with a block.
	 *  This code might actually be contained in the other file
	 */
	public Miner(int miningPower){
		this.miningPower = miningPower;
		for (int i=0; i < miningPower; i++) {
			
		}
		this.ID = Math.abs((System.currentTimeMillis() ^ 0xffffffffffffffffL) * ~miningPower); //minor bitwish hashing; should be sufficient at preventing collisions with a respectable sample size
		findConnections();
	}
	public void mineBlocks(int goal) {
		
	}
	
	/* not sure how I want this to work yet
	 * 
	 */
	public void findConnections() {
		
	}
	/* announce all found blocks to connections
	 * 
	 */
	public void announceBlocks(){
		
	}
	/* when told of a block by a fellow connection, spread the good news
	 * to all other connections
	 */
	public void spreadAnouncement(){
		
	}
	/*miner has hit the goal
	 * 
	 */
	public void won(){
		
	}
	
	/**
	* @return the identification number of this miner
	*/
	public long getID()
	{
		return this.ID;
	}
}
