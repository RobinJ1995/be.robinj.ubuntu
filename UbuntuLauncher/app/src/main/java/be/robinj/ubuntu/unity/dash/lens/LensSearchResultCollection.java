package be.robinj.ubuntu.unity.dash.lens;

import java.util.List;

/**
 * Created by robin on 5/11/14.
 */
public class LensSearchResultCollection
{
	private Lens lens;
	private List<LensSearchResult> results;

	public LensSearchResultCollection (Lens lens, List<LensSearchResult> results)
	{
		this.lens = lens;
		this.results = results;
	}
}
