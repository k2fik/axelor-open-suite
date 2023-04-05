/*
 * Axelor Business Solutions
 *
 * Copyright (C) 2023 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.stock.rest.dto;

import com.axelor.apps.stock.db.StockMoveLine;
import com.axelor.utils.api.ResponseStructure;

public class StockMoveLineResponse extends ResponseStructure {
  private final long id;
  private final long stockMoveId;
  private final long productId;
  private final int realQty;
  private final int conformity;

  public StockMoveLineResponse(StockMoveLine stockMoveLine) {
    super(stockMoveLine.getVersion());
    this.id = stockMoveLine.getId();
    this.stockMoveId = stockMoveLine.getStockMove().getId();
    this.productId = stockMoveLine.getProduct().getId();
    this.realQty = stockMoveLine.getRealQty().intValue();
    this.conformity = stockMoveLine.getConformitySelect();
  }

  public long getId() {
    return id;
  }

  public long getStockMoveId() {
    return stockMoveId;
  }

  public long getProductId() {
    return productId;
  }

  public int getRealQty() {
    return realQty;
  }

  public int getConformity() {
    return conformity;
  }
}