package com.hcx.tool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/25  21:19
 */
public class calDate {

//    public void cal(String time1) throws ParseException {
//        String time1= "2021-06-25 15:18:14";
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date1 = formatter.parse(time1);
//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String time2=simpleDateFormat.format(new Date());
//        Date date2=formatter.parse(time2);
//        int dif=dateDiff(date1,date2);
//        System.out.println(dif);
//
//    }

    public int dateDiff(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();

        Calendar cal2 = Calendar.getInstance();

        cal1.setTime(date1);

        cal2.setTime(date2);

        long ldate1 = date1.getTime() + cal1.get(Calendar.ZONE_OFFSET) + cal1.get(Calendar.DST_OFFSET);

        long ldate2 = date2.getTime() + cal2.get(Calendar.ZONE_OFFSET) + cal2.get(Calendar.DST_OFFSET);

// Use integer calculation, truncate the decimals

        int hr1 = (int) (ldate1 / 3600000); // 60*60*1000

        int hr2 = (int) (ldate2 / 3600000);

//        int days1 = hr1 / 24;
//
//        int days2 = hr2 / 24;
//
//        int dateDiff = days1 - days2;
        int dateDiff=hr2-hr1;

        return dateDiff;
    }

}
