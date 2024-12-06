public class Painting extends Art{
    private String paintType;
    public void viewArt(){
        System.out.printf("Title: %s ,Author : %s ,Desc: %s ,Paint Type: %s \n",this.title,this.author,this.description,this.paintType);
    }
    public Painting(String paintType ,String title,String author,String description) {
        this.paintType = paintType;
        this.title=title;
        this.author= author;
        this.description=description;
    }
    public String getPaintType() {
        return paintType;
    }
    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }

}
