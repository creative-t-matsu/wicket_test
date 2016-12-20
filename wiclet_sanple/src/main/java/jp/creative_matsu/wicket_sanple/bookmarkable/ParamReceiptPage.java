package jp.creative_matsu.wicket_sanple.bookmarkable;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class ParamReceiptPage extends WebPage{
	private static final long serialVersionUID = 1L;
	
	public ParamReceiptPage(){
		this(null);
	}
	
	public ParamReceiptPage(PageParameters params){
		IModel<String> param1Model = Model.of("パラメータが送信されていません：param1");
		IModel<String> param2Model = Model.of("パラメータが送信されていません：param2");
		
		if(params != null){
			param1Model.setObject(params.get("param1").toString("パラメータがありません：param1"));
			param2Model.setObject(params.get("param2").toString("パラメータがありません：param2"));
		}
		add(new Label("param1",param1Model));
		add(new Label("param2",param2Model));
	}
	
}