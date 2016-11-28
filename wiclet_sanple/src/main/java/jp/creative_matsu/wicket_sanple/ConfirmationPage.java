package jp.creative_matsu.wicket_sanple;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.IModel;

public class ConfirmationPage extends WebPage {
	private static final long serialVersionUID = 1L;

	public ConfirmationPage(IModel<String> nameModel, IModel<String> lunchModel) {

		// 練習の内容を満たすように自分で書いてみてください。

		//--- 以下解答してみました ---//
		IModel<String> label1Model = nameModel;
		Label name = new Label("name", label1Model);
		add(name);

		IModel<String> label2Model = lunchModel;
		Label lunch = new Label("lunch", label2Model);
		add(lunch);

		/* 模範解答
		Label nameLabel = new Label("name", nameModel);

		add(nameLabel);

		Label lunchLabel = new Label("lunch", lunchModel);

		add(lunchLabel);
		*/
   }
}