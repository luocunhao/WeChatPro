
public class WechatGrade {
    private int id;
    private String grade;
	public WechatGrade() {
	}
	public WechatGrade(int id, String grade) {
		this.id = id;
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "WechatGrade [id=" + id + ", grade=" + grade + "]";
	}
    
}
