package Collection;
/**
 * @author 全文超
 *2015-08-08 09:49:19
 *
 */
public class Cell {
	
	private int row;
	private int col;
	
	public Cell(int row, int col){
		this.row = row;
		this.col = col;
	}
	 
	@Override
	public String toString(){
		return "(" + row + ","  + col +")";
	}
	
	@Override 
	public boolean equals(Object obj) {
		
		//必要的验证
		if(obj==null){
			return false;
		}
		
		if(obj == this){
			return true;
		}
		
		
		//判断对象的所属类型, 相同的实例才有可比性
		if(obj instanceof Cell){
			Cell cell = (Cell)obj;
			return this.row == cell.row && this.col == cell.col;
				
		}else{
			return false;
		}
	}	
	
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public static void main(String[] args) {
		
		Cell p = new Cell(1, 2);
		
		/**
		 * 所有的类都有toString()方法。
		 * 			toString()方法功能： 返回一个字符串。即返回对象所在堆内存的地址
		 */
		System.out.println(p);//(1,2)
		
		String str = p.toString();
//		System.out.println(str);//Object.Cell@811c88  		重写之前
		System.out.println(str);//(1,2)	重写之后
		
		
		Cell p2 = new Cell(1, 2);
		System.out.println(p.equals(p2));//true
	}
	
}
