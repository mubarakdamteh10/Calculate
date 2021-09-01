public class CalculateGrade {
    private int score;
    
    public CalculateGrade(int score) {
        this.score = score;
    }
    public int getScore() {
        return this.score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    
    public String calcuate() {
        String grade;
        
        if(this.score >= 80) {
            grade = "A";
        }else if(this.score >= 75) {
            grade = "B+";
        }else if(this.score >= 70) {
            grade = "B";
        }else if(this.score >= 60) {
            grade = "C";
        }else if(this.score >= 50) {
            grade = "D";
        }else {
            grade = "F";
        }
        
        return grade;
    }
    
}