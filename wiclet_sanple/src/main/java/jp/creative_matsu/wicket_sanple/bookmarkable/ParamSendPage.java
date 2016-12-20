package jp.creative_matsu.wicket_sanple.bookmarkable;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class ParamSendPage extends WebPage{
	private static final long serialVersionUID = 1L;
	
	public ParamSendPage(){
		BookmarkablePageLink<Void> withoutParamLink = new BookmarkablePageLink<>("withoutParamLink",ParamReceiptPage.class);
		add(withoutParamLink);
		
		PageParameters pageParameters = new PageParameters();
		pageParameters.add("param1", "1001");
		pageParameters.add("param2", "2002");
		
		BookmarkablePageLink<Void> withinParamLink = new BookmarkablePageLink<>("withinParamLink",ParamReceiptPage.class,pageParameters);
		add(withinParamLink);
	}
}