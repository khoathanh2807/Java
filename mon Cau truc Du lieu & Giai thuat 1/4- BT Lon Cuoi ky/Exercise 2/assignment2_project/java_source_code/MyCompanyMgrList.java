package tdt.algo;
import java.lang.*;
import java.io.*;
import java.util.*;

public class MyCompanyMgrList extends CompanyMgrList {	
	// you can add some more member variable if you need.
	
	public MyCompanyMgrList() {

		super();

	}
	
	/*********************************************************************************************/
	// you can add some more methods if you need.
	
	private int getEventCode(eventList pEvent) {

		// code here
		return pEvent.getnEventCode();

	}

	private int getProductId(int nEvent) {

		// code here
		return nEvent / 10;

	}

	/**
	 * get quantity fron nEventCode of eventList
	 */
	private int getQuan(int nEvent) {

		// code here
		return nEvent % 10;

	}

	/**
	 * add a new noteList add the end of linked-list notesList
	 * tail:  pointer to tail of head of notesList
	 * side-effec: tail point to the new node which is now the tail
	 */
	private void doImport(int nEventCode) {

		// code here
		notesList temp1 = new notesList((nEventCode / 10) % 1000, nEventCode % 10, 1);

		if(tail != null)
			tail.setNext(temp1);

		tail = temp1;

	}

	/**
	 * add a new noteList add the end of linked-list notesList
	 * tail:  pointer to tail of head of notesList
	 * side-effec: tail point to the new node which is now the tail
	 */
	private void doReserve(int nEventCode) {

		// code here
		notesList temp2 = new notesList((nEventCode / 10) % 1000, nEventCode % 10, 2);

		if(tail != null)
			tail.setNext(temp2);
			
		tail = temp2;

	}
	
	/**
	 * stats and delete IMPORTED product with code in nEventCode,
	 * side-effect: head, tail change
	 */
	private void doStatImport(int nEventCode) {

		// code here

	}

	private void doStatReserve(int nEventCode) {

		// code here

	}

	private void doStatRest(int nEventCode) {

		// code here

	}

	/**
	 *
	 * find Product with Max Rest in storage
	 */

	private void doMaxRestStat() {

		// code here

	}

	private void doRemoveInvalidReserve() {

		// code here

	}
	
	
	
	public void storage (notesList theFirst, eventList pEvent) {

		// code here
		head = new notesList();
		head.setnProdID(theFirst.getnProdID());
		head.setnQuan(theFirst.getnQuan());
		head.setnType(theFirst.getnType());
		head.setNext(null);
		tail = head;
		
		while(pEvent != null) {

			switch(getEventCode(pEvent) / 10000) {

				case eventList.TERMINATE_EVENT:
					return;
				case eventList.IMPORT_EVENT:
					doImport(pEvent.getnEventCode());
					break;
				case eventList.RESERVED_EVENT:
					doReserve(pEvent.getnEventCode());
					break;
				case eventList.STAT_IMPORT_EVENT:
					doStatImport(pEvent.getnEventCode());
					break;
				case eventList.STAT_RESERVED_EVENT:
					doStatReserve(pEvent.getnEventCode());
					break;
				case eventList.STAT_REST_EVENT:
					doStatRest(pEvent.getnEventCode());
					break;
				case eventList.MAX_REST_STAT_EVENT:
					doMaxRestStat();
					break;
				case eventList.REMOVE_INVALID_RESERVE_EVENT:
					doRemoveInvalidReserve();
					break;
				default:

			}

			pEvent = pEvent.getNext();

			if(head == null)
				break;

		}

	}
	
	
	String myStr = new String();
	notesList load = head;
	
	public boolean checkPalindrome(){
	/*
		// code here
		while(load != null){

			myStr = myStr + String.format("%03d", load.getnProdID()).concat(String.format("%02d", load.getnQuan())).concat(String.format("%1d", load.getnType()));
			load = load.getNext();

		}

		//System.out.println(myStr);
		String rev = new StringBuffer(myStr).reverse().toString();
		
		if(myStr.equals(rev)){

			return true;

		}
	*/
		return false;

	}

}