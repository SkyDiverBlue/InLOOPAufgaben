import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.awt.Point;


public class MyMatrix<T> implements Matrix<T>{
	
	//Attributes
	
	Map<Point, T> matrix = new HashMap<Point, T>();

	//Methods of Matrix
	
	public int getRowCount() {
		int columncount = 0;
		for(Map.Entry<Point, T> point : matrix.entrySet()) {
			if(point.getValue() != null && point.getKey().x > columncount) {
				columncount = point.getKey().x;
			}
		}
		if(matrix.isEmpty()) {
			return 0;
		}
		else {
			return columncount + 1;
		}
	}

	
	public int getColumnCount() {
		int columncount = 0;
		for(Map.Entry<Point, T> point : matrix.entrySet()) {
			if(point.getValue() != null && point.getKey().y > columncount) {
				columncount = point.getKey().y;
			}
		}
		if(matrix.isEmpty()) {
			return 0;
		}
		else {
			return columncount + 1;
		}		
	}
	
	public int getObjectCount() {
		return matrix.size();
	}

	public int getDistinctObjectCount() {
		Set<T> distinctObjects = new HashSet<T>();
		for(Map.Entry<Point, T> point : matrix.entrySet()) {
			distinctObjects.add(point.getValue());
		}
		return distinctObjects.size();
	}

	public T get(int row, int column) {
		if(row > getRowCount() - 1 | column > getColumnCount() - 1 | matrix.isEmpty()) {
			throw new IllegalArgumentException();
		}
		else {
			Point point = new Point(row, column);
			matrix.get(point);
			return matrix.get(point);
		}
	}

	public T put(int row, int column, T value) {
		Point point = new Point(row, column);
		if(matrix.isEmpty()) {
			matrix.put(point, value);
			return null;
		}
		if(matrix.containsKey(point) && matrix.get(point) != value) {
			T oldValue = matrix.get(point);
			matrix.put(point, value);
			return oldValue;
		}
		else {
			matrix.put(point, value);
			return value;
		}
	}

	public boolean contains(T value) {
		if(matrix.containsValue(value)) {
			return true;
		}
		else {
			return false;
		}
	}

	public Iterator<T> iterator() {
		DepthFirstIterator iterator = new DepthFirstIterator();
		return iterator;
	}
	
	//InnerClass of Matrix : DepthFirstIterator
	
		class DepthFirstIterator implements java.util.Iterator<T>{
			
			private List<T> valueArray = new ArrayList<T>();
			private int i = -1;
			
			public DepthFirstIterator() {
				List<Point> listOfPoints = new ArrayList<Point>(matrix.keySet());
					for(int y=0; y <= getRowCount(); y++) {
						for(int x=0; x <=  getColumnCount(); x++) {
							Point point = new Point(x,y);
							if(listOfPoints.contains(point)) {
								valueArray.add(matrix.get(point));
							}
						}
					}			
			}

			public boolean hasNext() {
				if(i+1 < valueArray.size()) {
					return true;
				}
				else {
					return false;
				}
				
			}
		
			public T next() {
				if(true == this.hasNext()) {
					i++;
					return valueArray.get(i);
				}
				else{
					throw new NoSuchElementException();	
				}
			}
			
			public void remove() {
				throw new UnsupportedOperationException("cannot remove anything");
			}
		
		}
	
	

}