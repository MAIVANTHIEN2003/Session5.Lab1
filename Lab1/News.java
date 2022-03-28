package Session5.Lab1;

public class News implements INews{
    //a.
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;

    //Getter and Setter


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }


    @Override
    public void Display() {
//        System.out.println("\t ID:"+ID);
        System.out.println("\t Title:"+Title);
        System.out.println("\t PublishDate:"+PublishDate);
        System.out.println("\t Author:"+Author);
        System.out.println("\t Content:"+Content);
        System.out.println("\t AverageRate:"+AverageRate);

    }
    public void Calculate(){
        int[] RateList = {6,8,12};
        int AverageRate = 0;
        for (int i = 0; i<RateList.length;i++){
            AverageRate = AverageRate + RateList[i];

        }
        int average = AverageRate / RateList.length;
        System.out.println("\t Ket qua:"+ average);
    }
}
