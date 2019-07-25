class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> courses = new ArrayList<>();
        for(int i=0;i<numCourses;i++) 
            courses.add(new ArrayList<>());
        for(int i=0;i<prerequisites.length;i++) 
            courses.get(prerequisites[i][0]).add(prerequisites[i][1]);

        int[] done=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(done[i]==0&&recur(courses,i,done))
                return false;
        }
        return true;
    }

    private boolean recur(List<List<Integer>> courses, int index, int[] done) {
        done[index]=-1;
        List<Integer> temp=courses.get(index);
        for (int i=0;i<temp.size();i++) {
            int next=temp.get(i);
            if(done[next]!=1&&(done[next]==-1||recur(courses,next,done)))
                return true;
        }
        done[index] = 1;
        return false;
    }
}