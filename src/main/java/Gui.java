import imgui.ImGui;
import imgui.app.Application;
import imgui.app.Configuration;
import imgui.type.ImBoolean;

public class Gui extends Application {
    Graph aGraph = new Graph();
    ImBoolean imTrue = new ImBoolean(true);

    @Override
    protected void configure(Configuration config) {
        config.setTitle("NerdyPilot");
    }

    @Override
    public void process() {
        ImGui.text("Hello, World!");
        FilterGraph.show(imTrue, aGraph);
    }

    public static void main(String[] args) {
        launch(new Gui());
    }
}