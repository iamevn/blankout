package sparkproject;
import wordgame.*;

import static spark.Spark.get;
public class Hello {

    public static void main(String[] args) {
        get("/", (req, res) -> {
            return "Your puzzle: " + core.genPuzz();
        });
    }

}
