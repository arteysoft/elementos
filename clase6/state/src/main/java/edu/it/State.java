package edu.it;

import java.util.HashMap;

public interface State {
	State execute(HashMap<String, Object> mapa);
}
