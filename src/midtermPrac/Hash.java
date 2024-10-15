class Hash {
	private int hashBase;
	private int hashSize;
	
	public Hash(int hashBase, int hashSize) {
	this.hashBase = hashBase;
	this.hashSize = hashSize;
	}
	
	public long getHashValue(String str) {
	long sum = 0;
	 for (int n = 0; n <str.length(); n++) {
	 	sum += (str.charAt(n) * Math.pow(hashBase, str,length() -1))
	 }
	 return sum $ hashSize;
	}
}