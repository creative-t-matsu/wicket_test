package jp.creative_matsu.wicket_sanple;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;

	public HomePage() {
		
		String message = "こんにちは。今日はWicketハンズオンです。";
		IModel<String> label1Model = Model.of(message);
		Label label1 = new Label("label1", label1Model);
		add(label1);
		
		//--- ハンズオン02追加分 ---//
		Link<Void> toFormPageLink = new Link<Void>("toFormPage"){
			
			private static final long sarialVersionUID = 1L;
			
			@Override
			public void onClick(){
				setResponsePage(new FormPage());
			}
		};
		add(toFormPageLink);
	}
}
