package kumagai.legend.struts2;

import java.util.HashMap;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 * 画像表示アクション。
 * @author kumagai
 */
@Namespace("/legend")
@Results
({
	@Result(name="success", location="/legend/image.jsp")
})
public class ImageAction
{
	public int number;
	public String topImagePath;
	public String [] imagesPath;
	public String movieImage1Path;
	public String movieImage2Path;
	public String reviewDate1;
	public String reviewDate2;
	public String message;

	/**
	 * 画像表示アクション。
	 * @return 処理結果
	 */
	@Action("image")
	public String execute()
		throws Exception
	{
		try
		{
			ImageAction imageForm = this;

			imageForm.topImagePath = String.format("ITEM/BG%d0.DIB", number);
			imageForm.movieImage1Path = String.format("AVI/MV%d1.AVI", number);
			imageForm.movieImage2Path = String.format("AVI/MV%d2.AVI", number);

			String [] imagesPath = new String [12];

			for (int i=0 ; i<12 ; i++)
			{
				imagesPath[i] =
					String.format("PHOTO24/LG%d%02d.DIB", number, i + 1);
			}

			imageForm.imagesPath = imagesPath;

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

			imageForm.reviewDate1 = days[0];

			if (days.length == 2)
			{
				imageForm.reviewDate2 = days[1];
			}

			return "success";
		}
		catch (Exception exception)
		{
			message = exception.toString();

			return "error";
		}
	}
}
