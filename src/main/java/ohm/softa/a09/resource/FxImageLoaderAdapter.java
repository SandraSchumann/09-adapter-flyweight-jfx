package ohm.softa.a09.resource;

import javafx.scene.image.Image;

public class FxImageLoaderAdapter {

	private ResourceLoader<Image> resourceloader = new ResourceLoader<>(Image::new);

	public Image loadImage(String path) {
		return resourceloader.loadResource(ClassLoader.getSystemClassLoader(), path);
	}
}
