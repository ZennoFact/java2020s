package day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SmartPhone {
	List<App> apps;

	public SmartPhone() {
		this.apps = new ArrayList<>();
	}

	public void install(App app) {
		this.apps.add(app);
	}

	public void uninstall(App app) {
		this.apps.remove(app);
	}

	public App play(String title) {
		App app = apps.stream()
					.filter(a -> a.title.equals(title))
					.collect(Collectors.toList())
					.get(0);
		return app;
	}
}
