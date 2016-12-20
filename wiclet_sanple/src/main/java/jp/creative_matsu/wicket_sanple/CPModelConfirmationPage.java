package jp.creative_matsu.wicket_sanple;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

public class CPModelConfirmationPage extends WebPage{
	
	private static final long serialVersionUID = 1L;
	
	public CPModelConfirmationPage(IModel<UserLunch> model){
		setDefaultModel(new CompoundPropertyModel<>(model));
		
		String message1 = model.getObject().getName();
		IModel<String> label1 = Model.of(message1);
		
		Label name = new Label("name",label1);
		add(name);
		
		String message2 = model.getObject().getLunch();
		IModel<String> label2 = Model.of(message2);
		
		Label lunch = new Label("lunch",label2);
		add(lunch);
	}
}