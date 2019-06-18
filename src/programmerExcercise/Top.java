package programmerExcercise;

public class Top {

	public static void main(String[] args) {
		int[] heights = {6,9,5,7,4};
	//	int[] heights = {3,9,9,3,5,7,2};
	//	int[] heights = {1,5,3,6,7,6,5};
		 int[] answer = new int[heights.length];
	        int count = 0;
	        
	        for(int i =0;i<heights.length;i++){
	            for(int z = i;z<heights.length-1;z++){
	                    if(heights[heights.length-i-1]<heights[heights.length-z-2]){
	                        answer[heights.length-i-1] = heights.length-z-1;
	                        break;
	                      }
	            }
	        }
	        for(int i=0;i<heights.length;i++){
	            if(answer[i]==0){
	                System.out.println(i+1+"탑이 쏜 신호는 아무도 수신하지 않았습니다.");
	            } else {
	                System.out.println(i+1+"탑이 쏜 신호는 "+answer[i]+"번째 탑이 수신합니다.");
	            }
	        }
	}

}
