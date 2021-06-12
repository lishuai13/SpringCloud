package com.lishuai.service.impl;

import com.lishuai.service.ExcelService;
import com.lishuai.utils.ExportExcel;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ExcelServiceImpl implements ExcelService {

    @Override
    public void exportTest(OutputStream out, String excelTitle) throws IOException {

        // 定義列頭
        String[] rowsName = new String[]{"序号", "用户名", "密码", "是否禁用"};
        List<Object[]> dataList = new ArrayList<Object[]>();

        // 模拟数据
        List<Map<String, Object>> list  = new ArrayList<>();

        Map<String, Object> map = new HashMap<>();
        map.put("userAccount", "zs");
        map.put("userPwd", "123");
        map.put("userDelete", true);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("userAccount", "lisi");
        map2.put("userPwd", "111");
        map2.put("userDelete", false);

        list.add(map);
        list.add(map2);

        // 存入數據
        for (Map<String, Object> m : list) {
            Object[] objs = new Object[]{"", m.get("userAccount"), m.get("userPwd"),
                    (boolean)m.get("userDelete") ? "已删除":"启用中"};
            dataList.add(objs);
        }

        // 生成EXCEL
        ExportExcel ex = new ExportExcel(excelTitle, rowsName, dataList);
        try {
            ex.export(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.flush();
        out.close();
    }
}
