package officersam.SampstonialRemnants;

import com.fs.starfarer.api.BaseModPlugin;

public class SampstonialRemnantsModPlugin extends BaseModPlugin {
    @Override
    public void onApplicationLoad() throws Exception {
        super.onApplicationLoad();

        // Test that the .jar is loaded and working, using the most obnoxious way possible.
        throw new RuntimeException("SampstonialRemnants mod loaded and working!\nRemove this crash in SampstonialRemnantsModPlugin.");
    }

    @Override
    public void onNewGame() {
        super.onNewGame();
        // Add your code here, or delete this method (it does nothing unless you add code)
    }

    // You can add more methods from ModPlugin here. Press Control-O in IntelliJ to see options.
}
