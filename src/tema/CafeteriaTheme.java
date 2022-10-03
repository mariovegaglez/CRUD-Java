package tema;

import com.formdev.flatlaf.FlatLightLaf;

public class CafeteriaTheme
	extends FlatLightLaf
{
	public static final String NAME = "CafeteriaTheme";

	public static boolean setup() {
		return setup( new CafeteriaTheme() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, CafeteriaTheme.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
