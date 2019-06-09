package com.imooc;

import com.imooc.domain.MetaDatabase;
import com.imooc.domain.MetaTable;
import com.imooc.service.MetaDatabaseService;
import com.imooc.service.MetaTableService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImoocBookScalaApplicationTests {

	@Autowired
	private MetaDatabaseService _metaDatabaseService;
	@Autowired
	private MetaTableService _metaTableService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testSave(){
		MetaDatabase database = new MetaDatabase();
		database.setName("defaul");
		database.setLocation("hdfs://hadoop000:8020/user/hive/passbook");
		_metaDatabaseService.save(database);
	}

	@Test
	public void testsaveTable(){
		MetaTable table = new MetaTable();
		table.setDbId(2);
		table.setName("fengzhanyuan");
		table.setTableType("21");
		_metaTableService.save(table);

	}

}
