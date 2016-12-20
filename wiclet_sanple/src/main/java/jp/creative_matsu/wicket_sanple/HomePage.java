package jp.creative_matsu.wicket_sanple;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

import jp.creative_matsu.wicket_sanple.bookmarkable.ParamSendPage;
import jp.creative_matsu.wicket_sanple.model_usage.ModelfulListViewPage;
import jp.creative_matsu.wicket_sanple.validation.ValidationFormPage;

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

		//--- ハンズオン05?追加分 ---//
		Link<Void> toListViewPageLink = new Link<Void>("toListViewPage"){

			private static final long sarialVersionUID = 1L;

			@Override
			public void onClick(){
				setResponsePage(new ListViewPage());
			}
		};
		add(toListViewPageLink);

		//--- ハンズオン06?追加分 ---//
		Link<Void> toListViewTablePageLink = new Link<Void>("toListViewTablePage"){

			private static final long sarialVersionUID = 1L;

			@Override
			public void onClick(){
				setResponsePage(new ListViewTablePage());
			}
		};
		add(toListViewTablePageLink);

		//--- ハンズオン07?追加分 ---//
		Link<Void> toCPModelFromPageLink = new Link<Void>("toCPModelFromPage"){

			private static final long sarialVersionUID = 1L;

			@Override
			public void onClick(){
				setResponsePage(new CPModelFromPage());
			}
		};
		add(toCPModelFromPageLink);
		
		//--- ハンズオン08?追加分 ---//
		Link<Void> toROModelPageLink = new Link<Void>("toROModelPage"){

			private static final long sarialVersionUID = 1L;

			@Override
			public void onClick(){
				setResponsePage(new ReadOnlyModelPage());
			}
		};
		add(toROModelPageLink);
		
		//--- ハンズオン09?追加分 ---//
		Link<Void> toModelfulListViewPageLink = new Link<Void>("toModelfulListViewPage"){

			private static final long sarialVersionUID = 1L;

			@Override
			public void onClick(){
				setResponsePage(new ModelfulListViewPage());
			}
		};
		add(toModelfulListViewPageLink);
		
		//--- ハンズオン10?追加分 ---//
		Link<Void> toValidationFormPageLink = new Link<Void>("toValidationFormPage"){

			private static final long sarialVersionUID = 1L;

			@Override
			public void onClick(){
				setResponsePage(new ValidationFormPage());
			}
		};
		add(toValidationFormPageLink);
		
		//--- ハンズオン11?追加分 ---//
		Link<Void> toParamSendPageLink = new Link<Void>("toParamSendPage"){

			private static final long sarialVersionUID = 1L;

			@Override
			public void onClick(){
				setResponsePage(new ParamSendPage());
			}
		};
		add(toParamSendPageLink);
	}
}
