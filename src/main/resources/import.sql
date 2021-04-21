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

--TECHNICAL
INSERT INTO cyrela.technical(id, name)VALUES(1, 'Hugo Chaves');
INSERT INTO cyrela.technical(id, name)VALUES(2, 'Aecio Neves');
INSERT INTO cyrela.technical(id, name)VALUES(3, 'Hebe Camargo');

--SCHEDULED_ACTIVITY
INSERT INTO cyrela.scheduled_activity(id, activity_type, expected_final_date, finished, initial_date, subject, customer_id, technical_id, unity_id)VALUES(1, 'Reforma', '16/04/2021', 0, '14/04/2021', 'Reformulação de vidros da fachada.', 2, 1, 1);
INSERT INTO cyrela.scheduled_activity(id, activity_type, expected_final_date, finished, initial_date, subject, customer_id, technical_id, unity_id)VALUES(2, 'Manutencao', '20/06/2021', 0, '10/08/2021', 'Manutencao na escada', 1, 2, 1);
INSERT INTO cyrela.scheduled_activity(id, activity_type, expected_final_date, finished, initial_date, subject, customer_id, technical_id, unity_id)VALUES(3, 'Instalacao', '28/06/2021', 0, '30/06/2021', 'Instalacao de corrimão', 1, 3, 1);
INSERT INTO cyrela.scheduled_activity(id, activity_type, expected_final_date, finished, initial_date, subject, customer_id, technical_id, unity_id)VALUES(4, 'Instalacao', '28/06/2021', 1, '30/06/2021', 'Instalacao de corrimão', 1, 3, 1);
INSERT INTO cyrela.scheduled_activity(id, activity_type, expected_final_date, finished, initial_date, subject, customer_id, technical_id, unity_id)VALUES(5, 'Instalacao', '28/06/2021', 1, '30/06/2021', 'Instalacao de corrimão', 1, 3, 1);


