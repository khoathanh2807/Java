package tdt.algo;

public class eventList {

	public static final int  TERMINATE_EVENT =	    		0;		// Cham dut ca truc
	public static final int  IMPORT_EVENT =         		1;		// Nhap kho
	public static final int  RESERVED_EVENT =      			2;		// Dat hang
	public static final int  STAT_IMPORT_EVENT =    		3;		// Thong ke san pham nhap kho
	public static final int  STAT_RESERVED_EVENT =   		4;		// Thong ke san pham duoc dat hang
	public static final int  STAT_REST_EVENT =              5;		// Thong ke san pham ton kho
	public static final int  MAX_REST_STAT_EVENT =			6;		// Cho biet san pham nao ton kho nhieu nhat
	public static final int  REMOVE_INVALID_RESERVE_EVENT = 8;		// Loai bo cac phieu dat hang khong hop le
	
	private int nEventCode; 
	
	private eventList next;
	
	public eventList() {

		this(-1, null);

	}
	
	public eventList(int nEventCode, eventList next) {

		this.nEventCode = nEventCode;
		this.next = next;

	}
	
	public int getnEventCode() {

		return nEventCode;

	}
	
	public eventList getNext() {

		return next;

	}
	
	public void setnEventCode(int nEventCode) {

		this.nEventCode = nEventCode;

	}
	
	public void setNext(eventList next) {

		this.next = next;

	}

}