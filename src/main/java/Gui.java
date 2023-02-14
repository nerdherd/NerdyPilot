import imgui.ImGui;
import imgui.app.Application;
import imgui.app.Configuration;

public class Gui extends Application {
    @Override
    protected void configure(Configuration config) {
        config.setTitle("NerdyPilot");
    }

    @Override
    public void process() {
        ImGui.text("Hello, World!");
    }

    public static void main(String[] args) {
        launch(new Gui());
    }
}