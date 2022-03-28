package Session5.Lab1;

public class Main {
    public static void main(String[] agrs){
        News ns = new News();
//        ns.ID =36;
        ns.Title = "Best Na cà rốt^>^.";
        ns.PublishDate = "19/02/2003";
        ns.Author = "Mai Van Thien";
        ns.Content = "Không có gì không thể ";
        ns.AverageRate = 30f ;
        ns.Display();
        ns.Calculate();
    }

}
