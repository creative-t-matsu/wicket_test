package jp.creative_matsu.wicket_sanple;

import java.util.Arrays;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RadioChoice;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.util.ListModel;

public class CPModelFromPage extends WebPage {

	private static final long serialVersionUID = 1L;
	
	public CPModelFromPage(){
		IModel<UserLunch> userLunchModel = new CompoundPropertyModel<>(new UserLunch());
		
		Form<UserLunch> form = new Form<UserLunch>("form",userLunchModel){
			private static final long serialVersionUID = 1L;
			
			@Override
			protected void onSubmit(){
				super.onSubmit();
				System.out.println("name : " + getModelObject().getName());
				System.out.println("lanch : " + getModelObject().getLunch());
				setResponsePage(new CPModelConfirmationPage(getModel()));
			}
		};
		add(form);
		
		TextField<String> nameField = new TextField<>("name");
		form.add(nameField);
		
		List<String> lunches = Arrays.asList("からあげ","とりかつ","とりgarlic");
		IModel<List<String>> lunchesModel = new ListModel<>(lunches);
		
		RadioChoice<String> radioChoice = new RadioChoice<>("lunch",lunchesModel);
		form.add(radioChoice);
	}
}