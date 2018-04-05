package kumagai.legend.struts;

import java.util.*;
import javax.servlet.http.*;
import org.apache.struts.action.*;

/**
 * 画像表示アクション。
 * @author kumagai
 */
public class ImageAction
	extends Action
{
	/**
	 * @see org.apache.struts.action.Action#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
	{
		ImageForm imageForm = (ImageForm)form;

		int number = imageForm.getNumber();

		imageForm.setTopImagePath(String.format("ITEM/BG%d0.DIB", number));
		imageForm.setMovieImage1Path(String.format("AVI/MV%d1.AVI", number));
		imageForm.setMovieImage2Path(String.format("AVI/MV%d2.AVI", number));

		String [] imagesPath = new String [12];

		for (int i=0 ; i<12 ; i++)
		{
			imagesPath[i] =
				String.format("PHOTO24/LG%d%02d.DIB", number, i + 1);
		}

		imageForm.setImagesPath(imagesPath);

		HashMap<Integer, String []> table = new HashMap<Integer, String []>();

		table.put(11, new String [] { "2013/03/03" });
		table.put(12, new String [] { "2013/03/04" });
		table.put(13, new String [] { "2013/03/05" });
		table.put(14, new String [] { "2013/03/06" });
		table.put(15, new String [] { "2013/03/07" });
		table.put(16, new String [] { "2013/03/08" });
		table.put(17, new String [] { "2013/03/09", "2013/03/10" });
		table.put(18, new String [] { "2013/03/11", "2013/03/12" });

		table.put(21, new String [] { "2013/03/13" });
		table.put(22, new String [] { "2013/03/14" });
		table.put(23, new String [] { "2013/03/15" });
		table.put(24, new String [] { "2013/03/16" });
		table.put(25, new String [] { "2013/03/17" });
		table.put(26, new String [] { "2013/03/18" });
		table.put(27, new String [] { "2013/03/19", "2013/03/20" });
		table.put(28, new String [] { "2013/03/21", "2013/03/22" });

		String [] days = table.get(number);

		imageForm.setReviewDate1(days[0]);

		if (days.length == 2)
		{
			imageForm.setReviewDate2(days[1]);
		}

		return mapping.findForward("success");
	}
}
