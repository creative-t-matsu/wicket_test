package jp.creative_matsu.wicket_sanple;

import java.util.Arrays;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RadioChoice;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

public class FormPage extends WebPage{
	
	private static final long serialVersionUID = 1L;
	
	private IModel<String> nameModel;
	private IModel<String> lunchModel;
	
	public FormPage(){
		nameModel = Model.of("");
		lunchModel = Model.of("");//--- ハンズオン03追加分 ---//
		
		Form<Void> form= new Form<Void>("form"){
			private static final long serialVersionUID = 1L;
			
			@Override
			protected void onSubmit(){
				super.onSubmit();
				System.out.println("name : " + nameModel.getObject());
				System.out.println("lunch : " + lunchModel.getObject());//--- ハンズオン03追加分 ---//
				setResponsePage(new ConfirmationPage(nameModel, lunchModel));//--- ハンズオン04追加分 ---//
			}
		};
		add(form);
		
		TextField<String> nameField = new TextField<>("name" , nameModel);
		form.add(nameField);
		
		//--- ハンズオン03追加分 ---//
		List<String> lunches = Arrays.asList("鶏唐揚げ定食","鳥かつ定食","鶏じゃねぇ！牛を寄越せ！！");
		IModel<List<String>> lunchesModel = Model.ofList(lunches);
		RadioChoice<String> radioChoice = new RadioChoice<>("lunch",lunchModel,lunchesModel);
		form.add(radioChoice);
	}
}