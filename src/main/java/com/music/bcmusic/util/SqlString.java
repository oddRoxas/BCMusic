package com.music.bcmusic.util;

import java.util.ArrayList;

/**
 * @author yg
 * 将数组拼接成sql中的in（）
 */
public class SqlString {
    /**
     * sql语句
     */
    private String sql="";

    public String getSqlString(ArrayList arrayList)
    {
        String str="";
        for(int i=0;i<arrayList.size();i++)
        {
            str="'"+arrayList.get(i)+"',";
            sql+=str;
        }
        //删除最后的，
        sql=sql.substring(0,sql.length()-1);
        sql="("+sql+")";
        return sql;
    }
}
