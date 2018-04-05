package kumagai.regend.struts;

import org.apache.struts.action.*;

/**
 * 画像表示アクション用フォーム。
 * @author kumagai
 */
public class ImageForm
	extends ActionForm
{
	private int number;
	private String topImagePath;
	private String [] imagesPath;
	private String movieImage1Path;
	private String movieImage2Path;
	private String reviewDate1;
	private String reviewDate2;

	/**
	 * タイトル番号を取得。
	 * @return タイトル番号
	 */
	public int getNumber()
	{
		return number;
	}

	/**
	 * タイトル番号を割り当て。
	 * @param number タイトル番号
	 */
	public void setNumber(int number)
	{
		this.number = number;
	}

	/**
	 * トップ画像ファイルパスを取得。
	 * @return トップ画像ファイルパス
	 */
	public String getTopImagePath()
	{
		return topImagePath;
	}

	/**
	 * トップ画像パスを割り当て。
	 * @param topImagePath トップ画像パス
	 */
	public void setTopImagePath(String topImagePath)
	{
		this.topImagePath = topImagePath;
	}

	/**
	 * 画像ファイルパスを割り当て。
	 * @param imagesPath 画像ファイルパス
	 */
	public void setImagesPath(String [] imagesPath)
	{
		this.imagesPath = imagesPath;
	}

	/**
	 * 画像１パスを取得。
	 * @return 画像１パス
	 */
	public String getImage1Path()
	{
		return imagesPath[0];
	}

	/**
	 * 画像２パスを取得。
	 * @return 画像２パス
	 */
	public String getImage2Path()
	{
		return imagesPath[1];
	}

	/**
	 * 画像３パスを取得。
	 * @return 画像３パス
	 */
	public String getImage3Path()
	{
		return imagesPath[2];
	}

	/**
	 * 画像４パスを取得。
	 * @return 画像４パス
	 */
	public String getImage4Path()
	{
		return imagesPath[3];
	}

	/**
	 * 画像５パスを取得。
	 * @return 画像５パス
	 */
	public String getImage5Path()
	{
		return imagesPath[4];
	}

	/**
	 * 画像６パスを取得。
	 * @return 画像６パス
	 */
	public String getImage6Path()
	{
		return imagesPath[5];
	}

	/**
	 * 画像７パスを取得。
	 * @return 画像７パス
	 */
	public String getImage7Path()
	{
		return imagesPath[6];
	}

	/**
	 * 画像８パスを取得。
	 * @return 画像８パス
	 */
	public String getImage8Path()
	{
		return imagesPath[7];
	}

	/**
	 * 画像９パスを取得。
	 * @return 画像９パス
	 */
	public String getImage9Path()
	{
		return imagesPath[8];
	}

	/**
	 * 画像１０パスを取得。
	 * @return 画像１０パス
	 */
	public String getImage10Path()
	{
		return imagesPath[9];
	}

	/**
	 * 画像１１パスを取得。
	 * @return 画像１１パス
	 */
	public String getImage11Path()
	{
		return imagesPath[10];
	}

	/**
	 * 画像１２パスを取得。
	 * @return 画像１２パス
	 */
	public String getImage12Path()
	{
		return imagesPath[11];
	}

	/**
	 * 動画１パスを取得。
	 * @return 動画１パス
	 */
	public String getMovieImage1Path()
	{
		return movieImage1Path;
	}

	/**
	 * 動画１パスを割り当て。
	 * @param movieImage1Path 動画１パス
	 */
	public void setMovieImage1Path(String movieImage1Path)
	{
		this.movieImage1Path = movieImage1Path;
	}

	/**
	 * 動画２パスを取得。
	 * @return 動画２パス
	 */
	public String getMovieImage2Path()
	{
		return movieImage2Path;
	}

	/**
	 * 動画２パスを割り当て。
	 * @param movieImage2Path 動画２パス
	 */
	public void setMovieImage2Path(String movieImage2Path)
	{
		this.movieImage2Path = movieImage2Path;
	}

	/**
	 * 日記でレビューした日付１を取得。
	 * @return 日記でレビューした日付１
	 */
	public String getReviewDate1()
	{
		return reviewDate1;
	}

	/**
	 * 日記でレビューした日付１を割り当て。
	 * @param reviewDate1 日記でレビューした日付１
	 */
	public void setReviewDate1(String reviewDate1)
	{
		this.reviewDate1 = reviewDate1;
	}

	/**
	 * 日記でレビューした日付２を取得。
	 * @return 日記でレビューした日付２
	 */
	public String getReviewDate2()
	{
		return reviewDate2;
	}

	/**
	 * 日記でレビューした日付２を割り当て。
	 * @param reviewDate2 日記でレビューした日付２
	 */
	public void setReviewDate2(String reviewDate2)
	{
		this.reviewDate2 = reviewDate2;
	}
}
