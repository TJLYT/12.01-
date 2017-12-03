package com.example.dto;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Org;

public interface OrgDto extends CrudRepository<Org, Long> {

   // List<Org> findByLastName(String lastName);
	/*public Map getPage(int page,int pageSize,
			HashMap<String,String> orderMaps,HashMap<String,String> filters) {
		Page<UserAccount> pageContent;
		if (pageSize < 1)
			pageSize = 1;
		if (pageSize > 100)
			pageSize = 100;

		List<Order> orders = new ArrayList<Order>();
		if (orderMaps != null) {
			for (String key : orderMaps.keySet()) {
				if ("DESC".equalsIgnoreCase(orderMaps.get(key))) {
					orders.add(new Order(Direction.DESC, key));
				} else {
					orders.add(new Order(Direction.ASC, key));
				}
			}
			
		}
		
		//传分页
		PageRequest pageable;
		if (orders.size() > 0) {
			pageable = new PageRequest(page, pageSize, new Sort(orders));
		} else {
			pageable = new PageRequest(page, pageSize);
		}
        //条件过滤
		if (filters != null) {
			Specification<UserAccount> spec = new Specification<UserAccount>() {
				@Override
				public Predicate toPredicate(Root<UserAccount> root,
						CriteriaQuery<?> query, CriteriaBuilder cb) {
					List<Predicate> pl = new ArrayList<Predicate>();
					for (String key : filters.keySet()) {
						// TODO should change with operator, and according to value
						String value = filters.get(key);
						if ("enabled".equalsIgnoreCase(key)) {
							if ("true".equalsIgnoreCase(value)) {
								pl.add(cb.equal(root.get(key), true));
							} else if ("false".equalsIgnoreCase(value)) {
								pl.add(cb.equal(root.get(key), false));
							}
						} else if ("code".equalsIgnoreCase(key)) {
							if (value.length() > 0)
								pl.add(cb.like(root.<String> get(key), value + "%"));
						} else if ("name".equalsIgnoreCase(key)) {
							if (value.length() > 0)
								pl.add(cb.like(root.get(key), value));
						}
					}
					return cb.and(pl.toArray(new Predicate[0]));
				}
			};
			pageContent = userAccountRepository.findAll(spec, pageable);
		} else {
			pageContent = userAccountRepository.findAll(pageable);
		}
		Map map = new HashMap();
		map.put("total", pageContent.getTotalElements());
		map.put("users", accountPage2Dto(pageContent));
		return map;
	}
*/



		}

