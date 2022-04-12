package tdt.algo;

class notesList {

	//define noteList types
	public static final int  STAT_TYPE = 		0;		// Thong ke
	public static final int  IMPORT_TYPE = 		1;		// Nhap kho
	public static final int  RESERVED_TYPE =	2;		// Dat hang
	
	// define member variables
	private int nProdID; 	// ID san pham
	private int nQuan;		// so luong san pham, toi da 2 chu so
	private int nType; 		// 1: nhap kho, 2: khach dat hang, 0: thong ke

	private notesList next;
	
	public notesList() {

		this(-1, 0, -1, null);

	}
	
	public notesList(int nProdID, int nQuan, int nType) {

		this(nProdID, nQuan, nType, null);

	}
	
	public notesList(int nProdID, int nQuan, int nType, notesList next) {

		this.nProdID = nProdID;
		this.nQuan = nQuan;
		this.nType = nType;
		
		this.next = next;

	}
	
	public int getnProdID() {

		return nProdID;

	}
	
	public int getnQuan() {

		return nQuan;

	}
	
	public int getnType() {

		return nType;

	}
	
	public notesList getNext() {

		return next;

	}
	
	public void setnProdID(int nProdID) {

		this.nProdID = nProdID;

	}
	
	public void setnQuan(int nQuan) {

		this.nQuan = nQuan;

	}
	
	public void setnType(int nType) {

		this.nType = nType;

	}
	
	public void setNext(notesList next) {

		this.next = next;

	}

}