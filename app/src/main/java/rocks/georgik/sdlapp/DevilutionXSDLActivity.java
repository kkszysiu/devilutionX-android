package rocks.georgik.sdlapp;

import org.libsdl.app.SDLActivity;

public class DevilutionXSDLActivity extends SDLActivity {
    protected String[] getLibraries() {
        return new String[] {
                "SDL2",
                // "SDL2_image",
                "SDL2_mixer",
                // "SDL2_net",
                "SDL2_ttf",
                "devilutionx"
        };
    }
}