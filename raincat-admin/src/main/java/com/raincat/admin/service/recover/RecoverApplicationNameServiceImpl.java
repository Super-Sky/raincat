/*
 *
 * Copyright 2017-2018 549477611@qq.com(xiaoyu)
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.raincat.admin.service.recover;

import com.google.common.collect.Lists;
import com.raincat.admin.service.RecoverApplicationNameService;
import com.raincat.admin.service.apps.AcceptApplicationNameExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * RecoverApplicationNameServiceImpl.
 *
 * @author xiaoyu(Myth)
 */
@Service("recoverApplicationNameService")
public class RecoverApplicationNameServiceImpl implements RecoverApplicationNameService {

    @Autowired
    private AcceptApplicationNameExecutor executor;

    @Override
    public List<String> list() {
        List<String> apps = Lists.newArrayList();
        executor.execute(apps);
        return apps;
    }
}
