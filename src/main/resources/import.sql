--FLAG
INSERT INTO cyrela.flag(id, name)VALUES(1, 'cyrela1');
INSERT INTO cyrela.flag(id, name)VALUES(2, 'cyrela2');
INSERT INTO cyrela.flag(id, name)VALUES(3, 'cyrela3');

--ENTERPRISE
INSERT INTO cyrela.enterprise(id, address, city, condominium, `number`, state, zipcode, flag_id)VALUES(1,'rua flamengo', 'rj', 'cyrela leblon', 123, 'rj', '00235-123', 1);
INSERT INTO cyrela.enterprise(id, address, city, condominium, `number`, state, zipcode, flag_id)VALUES(2,'rua gomes barbosa', 'sp', 'cyrela moema', 689, 'sp', '03235-023', 1);

--APARTAMENT_UNITY
INSERT INTO cyrela.apartament_unity(id, block, `number`, enterprise_id)VALUES(1, 123, 67, 1);
INSERT INTO cyrela.apartament_unity(id, block, `number`, enterprise_id)VALUES(2, 321, 90, 2);

--CUSTOMER
INSERT INTO cyrela.customer (id, cpf, email, name, phone, ownership_id)VALUES(1,'426.164.548-31', 'carlos@teste.com', 'Carlos Silva', '971368727', 1);
INSERT INTO cyrela.customer (id, cpf, email, name, phone, ownership_id)VALUES(2,'657.367.123-45', 'armando@teste.com', 'Armando Costa', '95379364', 2);