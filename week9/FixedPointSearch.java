public class FixedPointSearch {
	/*
		A method for finding an element in arr 
		such that the element value equals to its index.
	*/
	public Integer search(int[] arr, int start, int end) {
		if(start>end){
			return null;
		}else if(start==end||start==end-1){
			if(arr[start]==start){
				return start;
			}else if(arr[end]==end){
				return end;
			}else{
				return null;
			}
		}else if(arr[(start+end)/2]>(start+end)/2){
			return search(arr,start,(start+end)/2);
		}else if(arr[(start+end)/2]<(start+end)/2){
			return search(arr,(start+end)/2,end);
		}else if(arr[(start+end)/2]==(start+end)/2){
			return (start+end)/2;
		}
		return null;
	}
}